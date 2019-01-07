package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

    public class SearchPage extends CommonAPI {

        public void searchMenu(){
            typeOnElementEntry("#twotabsearchtextbox", "book");
            navigateBack();
            typeOnElementEntry("#twotabsearchtextbox", "bag");
            navigateBack();
            typeOnElementEntry("#twotabsearchtextbox", "toy");
            navigateBack();

    }
}
