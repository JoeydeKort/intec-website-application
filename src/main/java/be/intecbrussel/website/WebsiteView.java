package be.intecbrussel.website;

import com.vaadin.flow.component.ReconnectDialogConfiguration;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class WebsiteView extends SplitLayout {

    private String adminUrl = "http://localhost:8083/ui/";

    private String newsUrl = "http://localhost:8084/ui/";

    private Integer uiSplitPosition = 30;

    public WebsiteView() {
        ReconnectDialogConfiguration configuration = UI.getCurrent().getReconnectDialogConfiguration();
        configuration.setDialogText("Please wait...");
        configuration.setReconnectInterval(1000);

        addToPrimary(new IFrame(adminUrl));
        addToSecondary(new IFrame(newsUrl));
        setSplitterPosition(uiSplitPosition);
        setSizeFull();

    }

}
