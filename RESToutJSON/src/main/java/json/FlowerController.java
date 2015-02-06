
package json;

/**
 *
 * @author saara
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FlowerController {
    
    @RequestMapping(value="/flower", method = RequestMethod.GET, produces="application/json")
    public @ResponseBody Flower getFlower(){
        Flower flower = new Flower();
        flower.setId(1);
        flower.setName("rose");
        return flower;
    }
    
}
