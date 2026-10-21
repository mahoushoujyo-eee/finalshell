import com._y_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class WO implements ActionListener {
   final U H;

   WO(U var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = F8.y();
      _y_2 var10000 = (_y_2)com.c.c(208444474277099894L).get(com.c.c(313561084464947367L).get(this));
      if (var2 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (_y_2)com.c.c(208444474277099894L).get(com.c.c(313561084464947367L).get(this));
      }

      var10000.h(((JToggleButton)com.c.c(465653008199209678L).get(com.c.c(313561084464947367L).get(this))).isSelected());
   }
}





