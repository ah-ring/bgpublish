/**
 * 
 */
package com.bgpublish.web;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bgpublish.service.StoreService;

/**
 * 商家信息Web Controller
 * 
 * @author pansen
 *
 */
@RestController
@RequestMapping(value="/sgams/store")
public class StoreController {

	private @Autowired @Getter @Setter StoreService storeService;

}
