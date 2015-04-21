/**
 * 
 */
package com.bgpublish.web;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.bgpublish.App;
import com.bgpublish.domain.User;

/**
 * 用户接口测试
 * 
 * @author pansen
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class UserControllerTest {

	@Autowired
	private UserController userController;
	
	@Value("${local.server.port}")
    private int port;

	private URL base;
	private RestTemplate template;

	@Before
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + this.port);
		template = new TestRestTemplate();
	}

	@Test
	public void testSelectUser() {
		
		ResponseEntity<String> response =
				template.getForEntity(this.base.toString() + "/user/query.do?id=1", String.class);
		
		assertEquals(HttpStatus.OK , response.getStatusCode());
		
		assertThat(response.getBody(),is("{\"user_id\":1,\"name\":\"pansen\",\"password\":\"pansen\"}"));
		
		
		try {
			User user = template.getForObject(this.base.toString() + "/user/query.do?id=1", User.class);
			assertThat(user.getName(), is("pansen"));
		} catch (RestClientException e) {
			e.printStackTrace();
		}
		
		
	}
}
