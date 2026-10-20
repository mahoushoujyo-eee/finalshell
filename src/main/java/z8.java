/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JComponent;

public class z8
extends JComponent {
    CardLayout G;

    public z8() {
        this.G = new CardLayout();
        this.setLayout((CardLayout)this.G);
    }

    public void c(JComponent jComponent) {
        this.add((Component)jComponent, jComponent.getName());
    }

    public void P(JComponent jComponent) {
        ((CardLayout)this.G).show(this, jComponent.getName());
    }
}

