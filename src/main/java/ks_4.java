import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class ks_4 extends AbstractAction {
   private UndoManager b;

   public ks_4(UndoManager var1) {
      com.c.c(124256119779299785L).set(this, var1);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         ((UndoManager)com.c.c(124256119779299785L).get(this)).undo();
      } catch (CannotUndoException var3) {
         Toolkit.getDefaultToolkit().beep();
      }
   }
}





