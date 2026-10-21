import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JComponent;

public class as_2 extends JComponent {
   aJ U;
   Tv_2 V;
   dy_4 q;

   public as_2(nj_2 var1, aJ var2) {
      com.c.c(165188491801132237L).set(this, new dy_4());
      this.setLayout((dy_4)com.c.c(165188491801132237L).get(this));
      com.c.c(539292081619626259L).set(this, var2);
      com.c.c(229342211508771365L).set(this, new Tv_2(var1, (aJ)com.c.c(539292081619626259L).get(this)));
      this.add((Tv_2)com.c.c(229342211508771365L).get(this));
      this.add((aJ)com.c.c(539292081619626259L).get(this));
      Method var10000 = (Method)com.c.c(539292081619626259L).get(this);
      Object[] var10001 = com.c.a(this);
      Method var10003 = com.c.d(460622801446089528L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public Dimension getPreferredSize() {
      String var1 = aA.z();
      aJ var10000 = (aJ)com.c.c(539292081619626259L).get(this);
      if (var1 == null) {
         if (var10000 == null) {
            return super.getPreferredSize();
         }

         var10000 = (aJ)com.c.c(539292081619626259L).get(this);
      }

      return var10000.getPreferredSize();
   }

   public dy_4 C() {
      return (dy_4)com.c.c(165188491801132237L).get(this);
   }

   public void Z(dy_4 var1) {
      com.c.c(165188491801132237L).set(this, var1);
   }

   public Tv_2 Y() {
      return (Tv_2)com.c.c(229342211508771365L).get(this);
   }

   public void P(Tv_2 var1) {
      com.c.c(229342211508771365L).set(this, var1);
   }
}





