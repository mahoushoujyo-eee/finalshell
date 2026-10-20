/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class LL
extends AbstractAction {
    private UndoManager H;

    public LL(UndoManager undoManager) {
        this.H = undoManager;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ((UndoManager)this.H).redo();
        }
        catch (CannotRedoException cannotRedoException) {
            Toolkit.getDefaultToolkit().beep();
        }
    }
}

