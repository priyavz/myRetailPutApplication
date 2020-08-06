package com.myretail.put.controller;

import com.myretail.common.model.ProductData;
import com.myretail.put.service.ProductPriceUpsertService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/myRetail/v1")
@Slf4j
public class MyRetailUpsertController {

    private final ProductPriceUpsertService productPriceUpsertService;
    @Autowired
    public MyRetailUpsertController(ProductPriceUpsertService productPriceUpsertService) {
        this.productPriceUpsertService = productPriceUpsertService;
    }

    @RequestMapping(value = "product/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<ProductData> updateProductPrice(@PathVariable String id, @RequestBody ProductData productData)  {
        MDC.put("uuid", id + "-" + UUID.randomUUID().toString());
        productPriceUpsertService.upsertProductPrice(productData);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
