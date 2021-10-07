module eu.hansolo.fx.fxmodules {
    // Java
    requires java.base;
    requires java.net.http;
    requires java.desktop;

    // Java-FX
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;

    // 3rd Party

    exports eu.hansolo.fx.fxmodules;
    exports eu.hansolo.fx.fxmodules.tools;
}