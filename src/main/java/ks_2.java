/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/*
 * Renamed from ks
 */
public class ks_2
extends AbstractAction {
    private UndoManager b;

    public ks_2(UndoManager undoManager) {
        this.b = undoManager;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ((UndoManager)this.b).undo();
        }
        catch (CannotUndoException cannotUndoException) {
            Toolkit.getDefaultToolkit().beep();
        }
    }
}

