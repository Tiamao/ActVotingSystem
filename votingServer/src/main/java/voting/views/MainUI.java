package voting.views;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

@Theme("valo")
@SpringUI
@SpringViewDisplay
public class MainUI extends UI implements ViewDisplay {
    private VerticalLayout root;
    private Panel springViewDisplay;

    @Override
    protected void init(VaadinRequest request) {
        root = new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);

        springViewDisplay = new Panel();
        springViewDisplay.setSizeFull();

        root.addComponent(springViewDisplay);
        root.setExpandRatio(springViewDisplay, 1.0f);

        setContent(root);
    }

    @Override
    public void showView(View view) {
        springViewDisplay.setContent((Component) view);
    }

    private Button createNavigationButton(String caption,
                                          final String viewName) {
        Button button = new Button(caption);
        button.addStyleName(ValoTheme.BUTTON_SMALL);
        button.addClickListener(
                event -> getUI().getNavigator().navigateTo(viewName));
        return button;
    }
}
