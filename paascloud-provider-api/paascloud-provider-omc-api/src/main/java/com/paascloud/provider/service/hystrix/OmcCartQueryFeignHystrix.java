package com.paascloud.provider.service.hystrix;

import com.paascloud.provider.model.vo.CartVo;
import com.paascloud.provider.service.OmcCartQueryFeignApi;
import com.passcloud.common.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc cart query feign hystrix.
 *
 * @author liyuzhang
 */
@Component
public class OmcCartQueryFeignHystrix implements OmcCartQueryFeignApi {

	@Override
	public Wrapper<CartVo> getCartVo(final Long userId) {
		return null;
	}
}
