import com._C;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class L implements ActionListener {
   final fX_3 l;
   final String Q;
   final JPopupMenu h;
   final W8 L;
   final Jx_2 n;
   private static final long a;

   L(Jx_2 var1, fX_3 var2, String var3, JPopupMenu var4, W8 var5) {
      this.n = var1;
      this.l = var2;
      this.Q = var3;
      this.h = var4;
      this.L = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(597882109718658433L).get(this);
      Object[] var10001 = com.c.a(com.c.c(215009972678572825L).get(this));
      Method var10003 = com.c.d(452642608051992089L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10000 = (Method)com.c.c(242072299205494154L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(528723233100399280L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      ((JPopupMenu)com.c.c(473012566903121712L).get(this)).remove((W8)com.c.c(240305057674664882L).get(this));
      ((JPopupMenu)com.c.c(473012566903121712L).get(this)).validate();
      ((JPopupMenu)com.c.c(473012566903121712L).get(this)).pack();
      Dimension var2 = ((JPopupMenu)com.c.c(473012566903121712L).get(this)).getPreferredSize();
      ((JPopupMenu)com.c.c(473012566903121712L).get(this))
         .show(
            (_C)com.c.c(435031631667149019L).get(com.c.c(242072299205494154L).get(this)),
            (int)a,
            ((_C)com.c.c(435031631667149019L).get(com.c.c(242072299205494154L).get(this))).getHeight() + 4
         );
      var10000 = (Method)com.c.c(242072299205494154L).get(this);
      var10001 = com.c.a(com.c.c(215009972678572825L).get(this));
      var10003 = com.c.d(491105122976850438L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var12 = (W8)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      W8 var3 = var12;
      ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(242072299205494154L).get(this))).remove(var3);
   }

   static {
      long var0 = 3271412899196078400L;
      long var10002 = -6757428886020458821L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





