import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class Qy_2 implements MouseListener {
   final a3 n;
   private static final long a;

   Qy_2(a3 var1) {
      this.n = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = a3.I();
      if (var1.getButton() == 1) {
         Method var10000 = (Method)com.c.c(170719139226265942L).get(this);
         Object[] var10001 = com.c.a(var1.getPoint());
         Method var10003 = com.c.d(229190360333115919L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var9 = (DefaultMutableTreeNode)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         DefaultMutableTreeNode var3 = var9;
         if (var3 != null) {
            label44: {
               long var4 = System.currentTimeMillis() - com.c.c(415368146415028056L).getLong(com.c.c(170719139226265942L).get(this));
               long var18;
               int var10 = (var18 = var4 - a) == 0L ? 0 : (var18 < 0L ? -1 : 1);
               if (var2 != null) {
                  if (var10 <= 0) {
                     return;
                  }

                  var11 = (a3)com.c.c(170719139226265942L).get(this);
                  if (var2 == null) {
                     break label44;
                  }

                  var10001 = com.c.a(var3);
                  var10003 = com.c.d(273277141783199649L);
                  var10002 = var10001;
                  a3 var15 = var11;
                  var10000 = var10003;

                  try {
                     var10 = (Boolean)var10000.invoke(var15, var10002);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }
               }

               if (var10 == 0) {
                  return;
               }

               var11 = (a3)com.c.c(170719139226265942L).get(this);
            }

            ((Km_2)com.c.c(285663222664681848L).get(var11)).clearSelection();
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      long var0 = 4099623915440704107L;
      long var10002 = 4099623915440704415L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





