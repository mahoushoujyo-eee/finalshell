import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class af_2 implements TreeSelectionListener {
   final aJ x;

   af_2(aJ var1) {
      this.x = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      String var2;
      DefaultMutableTreeNode var8;
      label52: {
         String var10000 = aA.z();
         com.c.c(159470416555914823L).setLong(com.c.c(317048384022246679L).get(this), System.currentTimeMillis());
         TreePath var3 = ((aJ)com.c.c(317048384022246679L).get(this)).getSelectionPath();
         var2 = var10000;
         Object var4 = null;
         var10000 = var3;
         if (var2 == null) {
            if (var3 == null) {
               var8 = (DefaultMutableTreeNode)com.c.c(213130010239103238L).get(com.c.c(317048384022246679L).get(this));
               break label52;
            }

            var10000 = (String)var3.getLastPathComponent();
         }

         var8 = (DefaultMutableTreeNode)var10000;
      }

      Object var13;
      label56: {
         boolean var11 = var8.getUserObject().getClass().equals(tf_4.class);
         if (var2 == null) {
            if (var11) {
               tf_4 var5 = (tf_4)var8.getUserObject();
               var13 = com.c.c(317048384022246679L).get(this);
               Object[] var10002 = com.c.f();
               Method var10004 = com.c.d(498856411508641826L);
               Object[] var10003 = var10002;
               tf_4 var17 = var5;
               Method var10001 = var10004;

               try {
                  var15 = var10001.invoke(var17, var10003);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               com.c.c(348708854043337366L).set(var13, var15);
               if (var2 == null) {
                  return;
               }
            }

            var13 = var8.getUserObject().getClass();
            if (var2 != null) {
               break label56;
            }

            var11 = var13.equals(ck_4.class);
         }

         if (!var11) {
            return;
         }

         var13 = var8.getUserObject();
      }

      ck_4 var9 = (ck_4)var13;
      var13 = com.c.c(317048384022246679L).get(this);
      File var16;
      Object[] var20 = com.c.f();
      Method var10006 = com.c.d(605430732347023634L);
      Object[] var10005 = var20;
      ck_4 var21 = var9;
      Method var18 = var10006;

      try {
         var19 = (String)var18.invoke(var21, var10005);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var16 = new File(var19);
      com.c.c(348708854043337366L).set(var13, var16.getParent());
   }
}





