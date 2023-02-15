package runtime;
import com.model.*;
import com.controller.*;
import com.vue.*;

public class ApplicationDemo {

	public static void main(String[] args) {
		ConvertView view = new ConvertView();
		ConvertModel model = new ConvertModel(view);
		ConvertController controller = new ConvertController(model, view);
		    controller.run();
		
	}

}
