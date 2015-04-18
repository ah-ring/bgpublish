/**
 * 
 */
package com.bgpublish.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Rest 例子
 * @author pansen
 *
 */
@RestController
public class Example {
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
