package jansproj.basicfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyEventPropagationApp extends Application 
{
	public KeyEventPropagationApp() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		stage.setTitle("Key Event Propagation");
		VBox root = new VBox();
		HBox colBox = new HBox();
		VBox cola = new VBox();
		Label colaLaba = new Label("Column A");
		// uncomment this to enable focus on this Label 
		//colaLaba.setFocusTraversable(true);
		Button colaButta = new Button("Column A");
		TextArea colaText = new TextArea();
		VBox colb = new VBox();
		Label colbLaba = new Label("Column B");
		Button colbButta = new Button("Column B");
		TextArea colbText = new TextArea();

		Scene scene = new Scene(root);
		MenuBar menubar = new MenuBar();
		MenuItem mia = new MenuItem("Item A");
		MenuItem mib = new MenuItem("Item B");
		MenuItem mic = new MenuItem("Item C");
		MenuItem mid = new MenuItem("Item D");
		MenuItem mie = new MenuItem("Item E");
		MenuItem mif = new MenuItem("Item F");
		MenuItem mig = new MenuItem("Item G");
		MenuItem mih = new MenuItem("Item H");
		MenuItem mii = new MenuItem("Item I");
		Menu ma = new Menu("Menu A");
		Menu mb = new Menu("Menu B");
		Menu mc = new Menu("Menu C");
		ma.getItems().addAll(mia, mib, mic);
		mb.getItems().addAll(mid, mie, mif);
		mc.getItems().addAll(mig, mih, mii);
		menubar.getMenus().addAll(ma, mb, mc);

		root.getChildren().add(menubar);
		root.getChildren().add(colBox);
		colBox.getChildren().add(cola);
		cola.getChildren().add(colaLaba);
		cola.getChildren().add(colaButta);
		cola.getChildren().add(colaText);
		colBox.getChildren().add(colb);
		colb.getChildren().add(colbLaba);
		colb.getChildren().add(colbButta);
		colb.getChildren().add(colbText);

		scene.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("Scene KeyPressed handler keycode= " + keyCode);
				}});
		scene.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("Scene KeyPressed filter keycode= " + keyCode);
				}});
		root.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("root (VBox) KeyPressed handler keycode= " + keyCode);
				}});
		root.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("root (VBox) KeyPressed filter keycode= " + keyCode);
				}});
		menubar.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("menubar (MenuBar) KeyPressed handler keycode= " + keyCode);
				}});
		menubar.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("menubar (MenuBar) KeyPressed filter keycode= " + keyCode);
				}});
		ma.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("ma (Menu) KeyPressed handler keycode= " + keyCode);
				}});
		mb.addEventHandler(KeyEvent.KEY_PRESSED,
				new EventHandler<KeyEvent>() {
					public void handle(KeyEvent e) {
						KeyCode keyCode = e.getCode();
						System.out.println("mb (Menu) KeyPressed handler keycode= " + keyCode);
					}});
		mc.addEventHandler(KeyEvent.KEY_PRESSED,
				new EventHandler<KeyEvent>() {
					public void handle(KeyEvent e) {
						KeyCode keyCode = e.getCode();
						System.out.println("mc (Menu) KeyPressed handler keycode= " + keyCode);
					}});

		cola.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("cola (VBox) KeyPressed handler keycode= " + keyCode);
				}});
		cola.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("cola (VBox) KeyPressed filter keycode= " + keyCode);
				}});
		colaLaba.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colaLaba (Label) KeyPressed handler keycode= " + keyCode);
				}});
		colaLaba.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colaLaba (Label) KeyPressed filter keycode= " + keyCode);
				}});
		colaButta.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colaButta (Button) KeyPressed handler keycode= " + keyCode);
				}});
		colaButta.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colaButta (Button) KeyPressed filter keycode= " + keyCode);
				}});
		colaText.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colaText (TextArea) KeyPressed handler keycode= " + keyCode);
				}});
		colaText.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colaText (TextArea) KeyPressed filter keycode= " + keyCode);
				}});

		colb.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colb (VBox) KeyPressed handler keycode= " + keyCode);
				}});
		colb.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colb (VBox) KeyPressed filter keycode= " + keyCode);
				}});
		colbLaba.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colbLaba (Label) KeyPressed handler keycode= " + keyCode);
				}});
		colbLaba.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colbLaba (Label) KeyPressed filter keycode= " + keyCode);
				}});
		colbButta.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colbButta (Button) KeyPressed handler keycode= " + keyCode);
				}});
		colbButta.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colbButta (Button) KeyPressed filter keycode= " + keyCode);
				}});
		colbText.addEventHandler(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colbText (TextArea) KeyPressed handler keycode= " + keyCode);
				}});
		colbText.addEventFilter(KeyEvent.KEY_PRESSED,
			new EventHandler<KeyEvent>() {
				public void handle(KeyEvent e) {
					KeyCode keyCode = e.getCode();
					System.out.println("colbText (TextArea) KeyPressed filter keycode= " + keyCode);
				}});

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}
