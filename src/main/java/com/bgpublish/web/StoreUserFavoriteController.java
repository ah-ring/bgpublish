/**
 * 
 */
package com.bgpublish.web;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bgpublish.service.StoreUserFavoriteService;

/**
 * 商家信息Web Controller
 * 
 * @author pansen
 *
 */
@RestController
@RequestMapping(value="/sgams/storeuf")
public class StoreUserFavoriteController {

	private @Autowired @Getter @Setter StoreUserFavoriteService storeUserFavoriteService;

}
