package com.flux.views.agentdashboardview;

import com.flux.data.SamplePerson;
import com.flux.services.SamplePersonService;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Agent Dashboard View")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 1)
@Route(value = "agent-dashboard-view")
@PermitAll
@Uses(Icon.class)
public class AgentDashboardViewView extends Composite<VerticalLayout> {

    public AgentDashboardViewView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        MenuBar menu = new MenuBar();
        MenuBar menu2 = new MenuBar();
        MenuBar menu3 = new MenuBar();
        MenuBar menu4 = new MenuBar();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Anchor link = new Anchor();
        Anchor link2 = new Anchor();
        Anchor link3 = new Anchor();
        Anchor link4 = new Anchor();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        FormLayout formLayout3Col = new FormLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        Button buttonPrimary = new Button();
        Grid stripedGrid = new Grid(SamplePerson.class);
        Hr hr = new Hr();
        FormLayout formLayout3Col2 = new FormLayout();
        H2 h23 = new H2();
        H2 h24 = new H2();
        Button buttonPrimary2 = new Button();
        MenuBar menuBar = new MenuBar();
        Grid stripedGrid2 = new Grid(SamplePerson.class);
        VerticalLayout layoutColumn5 = new VerticalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        menu.setWidth("min-content");
        setMenuSampleData(menu);
        menu2.setWidth("min-content");
        setMenuSampleData(menu2);
        menu3.setWidth("min-content");
        setMenuSampleData(menu3);
        menu4.setWidth("min-content");
        setMenuSampleData(menu4);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        link.setText("Hello Vaadin");
        link.setHref("#");
        link.setWidth("min-content");
        link2.setText("Hello Vaadin");
        link2.setHref("#");
        link2.setWidth("min-content");
        link3.setText("Hello Vaadin");
        link3.setHref("#");
        link3.setWidth("min-content");
        link4.setText("Hello Vaadin");
        link4.setHref("#");
        link4.setWidth("min-content");
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutColumn4.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.getStyle().set("flex-grow", "1");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h2.setText("Opportunities");
        h2.setWidth("max-content");
        h22.setText("blank text");
        h22.setWidth("max-content");
        buttonPrimary.setText("New Quote");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        stripedGrid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        stripedGrid.setWidth("100%");
        stripedGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(stripedGrid);
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h23.setText("Activities");
        h23.setWidth("max-content");
        h24.setText("blank text");
        h24.setWidth("max-content");
        buttonPrimary2.setText("New Activity");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        stripedGrid2.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        stripedGrid2.setWidth("100%");
        stripedGrid2.getStyle().set("flex-grow", "0");
        setGridSampleData(stripedGrid2);
        layoutColumn5.getStyle().set("flex-grow", "1");
        getContent().add(layoutRow);
        layoutRow.add(menu);
        layoutRow.add(menu2);
        layoutRow.add(menu3);
        layoutRow.add(menu4);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(link);
        layoutColumn2.add(link2);
        layoutColumn2.add(link3);
        layoutColumn2.add(link4);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(layoutColumn4);
        layoutColumn4.add(formLayout3Col);
        formLayout3Col.add(h2);
        formLayout3Col.add(h22);
        formLayout3Col.add(buttonPrimary);
        layoutColumn4.add(stripedGrid);
        layoutColumn4.add(hr);
        layoutColumn4.add(formLayout3Col2);
        formLayout3Col2.add(h23);
        formLayout3Col2.add(h24);
        formLayout3Col2.add(buttonPrimary2);
        layoutColumn4.add(menuBar);
        layoutColumn4.add(stripedGrid2);
        layoutRow2.add(layoutColumn5);
    }

    private void setMenuSampleData(MenuBar menuBar) {
        menuBar.addThemeVariants(MenuBarVariant.LUMO_ICON);
        MenuItem share = menuBar.addItem(new Text("Share"));
        share.add(new Icon(VaadinIcon.ANGLE_DOWN));
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook");
        socialMediaSubMenu.addItem("Twitter");
        socialMediaSubMenu.addItem("Instagram");
        shareSubMenu.addItem("By email");
        shareSubMenu.addItem("Get Link");
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }
}
