import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class k7_2 implements TreeSelectionListener {
   final DefaultMutableTreeNode s;
   final zd_2 q;
   final Kb_2 I;

   k7_2(Kb_2 var1, DefaultMutableTreeNode var2, zd_2 var3) {
      this.I = var1;
      this.s = var2;
      this.q = var3;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      int var10000 = z7.m();
      com.c.c(625121400334282112L).setLong(com.c.c(432279057068136028L).get(this), System.currentTimeMillis());
      int var2 = var10000;
      Object var10 = com.c.c(418996528515713032L).get(com.c.c(432279057068136028L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(148691699844242618L);
      Object[] var10002 = var10001;
      var10001 = (Object[])var10;
      Method var11 = var10003;

      try {
         var12 = (DefaultMutableTreeNode)var11.invoke(var10001, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      DefaultMutableTreeNode var3 = var12;
      DefaultMutableTreeNode var13 = var3;
      if (var2 != 0) {
         if (var3 == null) {
            return;
         }

         var13 = var3;
      }

      label91: {
         label92: {
            var14 = var13.equals((DefaultMutableTreeNode)com.c.c(278769137899237136L).get(this));
            if (var2 != 0) {
               if (var14) {
                  Object var15 = com.c.c(605945497076756383L).get(com.c.c(432279057068136028L).get(this));
                  var10001 = com.c.a(com.c.c(124846334272944128L).get(this));
                  var10003 = com.c.d(262788292718351309L);
                  var10002 = var10001;
                  var10001 = (Object[])var15;
                  Method var16 = var10003;

                  try {
                     var16.invoke(var10001, var10002);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  if (var2 != 0) {
                     break label92;
                  }
               }

               var14 = var3.equals((DefaultMutableTreeNode)com.c.c(477205005732428780L).get(com.c.c(432279057068136028L).get(this)));
            }

            if (var2 == 0) {
               break label91;
            }

            if (var14) {
               Object var17 = com.c.c(605945497076756383L).get(com.c.c(432279057068136028L).get(this));
               var10001 = com.c.a(com.c.c(619862119829431751L).get(com.c.c(432279057068136028L).get(this)));
               var10003 = com.c.d(262788292718351309L);
               var10002 = var10001;
               var10001 = (Object[])var17;
               Method var18 = var10003;

               try {
                  var18.invoke(var10001, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }
            }
         }

         Object var19 = com.c.c(432279057068136028L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(589770811905469363L);
         var10002 = var10001;
         var10001 = (Object[])var19;
         Method var20 = var10003;

         try {
            var14 = (Boolean)var20.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }

      boolean var4 = var14;
      if (var1.getOldLeadSelectionPath() != null) {
      }

      label94: {
         boolean var21 = var4;
         if (var2 != 0) {
            if (var4) {
               break label94;
            }

            var21 = var3.equals((DefaultMutableTreeNode)com.c.c(292193458601960086L).get(com.c.c(432279057068136028L).get(this)));
         }

         if (var21) {
            return;
         }

         Object var22 = com.c.c(432279057068136028L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(467968002539848304L);
         var10002 = var10001;
         var10001 = (Object[])var22;
         Method var23 = var10003;

         try {
            var23.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         if (var2 != 0) {
            return;
         }
      }

      com.c.c(292193458601960086L).set(com.c.c(432279057068136028L).get(this), var3);
   }
}





