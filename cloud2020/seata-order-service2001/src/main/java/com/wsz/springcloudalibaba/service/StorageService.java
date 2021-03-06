package com.wsz.springcloudalibaba.service;

import com.wsz.springcloudalibaba.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @RequestMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}