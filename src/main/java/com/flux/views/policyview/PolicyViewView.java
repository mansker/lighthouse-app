package com.flux.views.policyview;

import com.flux.data.SamplePerson;
import com.flux.services.SamplePersonService;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Policy View")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 3)
@Route(value = "policy-view")
@RolesAllowed("USER")
@Uses(Icon.class)
public class PolicyViewView extends Composite<VerticalLayout> {

    public PolicyViewView() {
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
        Paragraph textSmall = new Paragraph();
        FormLayout formLayout2Col = new FormLayout();
        Accordion accordion = new Accordion();
        Accordion accordion2 = new Accordion();
        FormLayout formLayout3Col = new FormLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        Button buttonPrimary = new Button();
        Grid multiSelectGrid = new Grid(SamplePerson.class);
        Hr hr = new Hr();
        H2 h23 = new H2();
        TabSheet tabSheet = new TabSheet();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        FormLayout formLayout2Col2 = new FormLayout();
        H4 h4 = new H4();
        Paragraph textMedium = new Paragraph();
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
        textSmall.setText("Policy Number: PU-Policy-000001");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        formLayout2Col.setWidth("100%");
        accordion.setWidth("100%");
        setAccordionSampleData(accordion);
        accordion2.setWidth("100%");
        setAccordionSampleData(accordion2);
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        h2.setText("Activities");
        h2.setWidth("max-content");
        h22.setText("blank text");
        h22.setWidth("max-content");
        buttonPrimary.setText("New Activity");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        multiSelectGrid.setWidth("100%");
        multiSelectGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(multiSelectGrid);
        h23.setText("Insurance Details");
        h23.setWidth("max-content");
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        layoutColumn4.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.getStyle().set("flex-grow", "1");
        formLayout2Col2.setWidth("100%");
        h4.setText("Coverage name");
        h4.setWidth("max-content");
        textMedium.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
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
        layoutColumn3.add(textSmall);
        layoutColumn3.add(formLayout2Col);
        formLayout2Col.add(accordion);
        formLayout2Col.add(accordion2);
        layoutColumn3.add(formLayout3Col);
        formLayout3Col.add(h2);
        formLayout3Col.add(h22);
        formLayout3Col.add(buttonPrimary);
        layoutColumn3.add(multiSelectGrid);
        layoutColumn3.add(hr);
        layoutColumn3.add(h23);
        layoutColumn3.add(tabSheet);
        layoutColumn3.add(layoutColumn4);
        layoutColumn4.add(formLayout2Col2);
        formLayout2Col2.add(h4);
        formLayout2Col2.add(textMedium);
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

    private void setAccordionSampleData(Accordion accordion) {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");
        VerticalLayout personalInformationLayout = new VerticalLayout(name, email, phone);
        personalInformationLayout.setSpacing(false);
        personalInformationLayout.setPadding(false);
        accordion.add("Personal information", personalInformationLayout);
        Span street = new Span("4027 Amber Lake Canyon");
        Span zipCode = new Span("72333-5884 Cozy Nook");
        Span city = new Span("Arkansas");
        VerticalLayout billingAddressLayout = new VerticalLayout();
        billingAddressLayout.setSpacing(false);
        billingAddressLayout.setPadding(false);
        billingAddressLayout.add(street, zipCode, city);
        accordion.add("Billing address", billingAddressLayout);
        Span cardBrand = new Span("Mastercard");
        Span cardNumber = new Span("1234 5678 9012 3456");
        Span expiryDate = new Span("Expires 06/21");
        VerticalLayout paymentLayout = new VerticalLayout();
        paymentLayout.setSpacing(false);
        paymentLayout.setPadding(false);
        paymentLayout.add(cardBrand, cardNumber, expiryDate);
        accordion.add("Payment", paymentLayout);
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }
}
