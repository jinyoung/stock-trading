
package stock.trading.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="assets", url="http://assets:8080", fallback=AssetServiceImpl.class)
public interface AssetService {
    @RequestMapping(method= RequestMethod.GET, path="/assets/{item}")
    public Asset getAsset(@PathVariable("item") String item);

}

