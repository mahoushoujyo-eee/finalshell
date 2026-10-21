import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class LL extends AbstractAction {
   private UndoManager H;

   public LL(UndoManager var1) {
      com.c.c(336675141547947742L).set(this, var1);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         ((UndoManager)com.c.c(336675141547947742L).get(this)).redo();
      } catch (CannotRedoException var3) {
         Toolkit.getDefaultToolkit().beep();
      }
   }
}





