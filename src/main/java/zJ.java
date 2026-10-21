import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class zJ implements TreeSelectionListener {
   final kl_4 H;
   final a3 b;

   zJ(a3 var1, kl_4 var2) {
      this.b = var1;
      this.H = var2;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      int[] var2;
      TreePath var3;
      label86: {
         int[] var10000 = a3.I();
         com.c.c(415368146415028056L).setLong(com.c.c(392656021909457851L).get(this), System.currentTimeMillis());
         var2 = var10000;
         var3 = ((a3)com.c.c(392656021909457851L).get(this)).getSelectionPath();
         TableCellEditor var12 = ((Km_2)com.c.c(285663222664681848L).get(com.c.c(392656021909457851L).get(this))).getCellEditor();
         if (var2 != null) {
            if (var12 == null) {
               break label86;
            }

            var12 = ((Km_2)com.c.c(285663222664681848L).get(com.c.c(392656021909457851L).get(this))).getCellEditor();
         }

         var12.stopCellEditing();
      }

      Method var13 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var13 = (Method)var3.getLastPathComponent();
      }

      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var13;
      var13 = var4.getUserObject().getClass();
      if (var2 != null) {
         if (!var13.equals(tf_4.class)) {
            return;
         }

         var13 = var4.getUserObject();
      }

      tf_4 var5 = (tf_4)var13;
      var13 = com.c.c(285663222664681848L).get(com.c.c(392656021909457851L).get(this));
      Object[] var10001 = com.c.a(0);
      Method var10003 = com.c.d(598070921885718443L);
      Object[] var10002 = var10001;
      var10001 = (Object[])var13;
      var13 = var10003;

      try {
         var13.invoke(var10001, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var13 = (Method)com.c.c(219163962651374930L).get(this);
      var10001 = com.c.a(var5);
      var10003 = com.c.d(217942201414471271L);
      var10002 = var10001;
      var10001 = var13;
      var13 = var10003;

      try {
         var13.invoke(var10001, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      a3 var19 = (a3)com.c.c(392656021909457851L).get(this);
      if (var2 != null) {
         var10002 = com.c.f();
         Method var10004 = com.c.d(498856411508641826L);
         Object[] var43 = var10002;
         tf_4 var37 = var5;
         Method var27 = var10004;

         try {
            var10001 = (Object[])var27.invoke(var37, var43);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         com.c.c(343160910034620817L).set(var19, var10001);
         var10001 = com.c.f();
         var10003 = com.c.d(490764181082108623L);
         var10002 = var10001;
         tf_4 var30 = var5;
         var13 = var10003;

         try {
            var21 = (Boolean)var13.invoke(var30, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         if (var21) {
            return;
         }

         var19 = (a3)com.c.c(392656021909457851L).get(this);
      }

      var13 = (Method)com.c.c(592764144014982287L).get(var19);
      var10002 = com.c.f();
      Method var47 = com.c.d(498856411508641826L);
      Object[] var45 = var10002;
      tf_4 var40 = var5;
      Method var31 = var47;

      try {
         var10001 = (Object[])var31.invoke(var40, var45);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.a(var10001);
      var10003 = com.c.d(512058916537400437L);
      var10002 = var10001;
      var10001 = var13;
      var13 = var10003;

      try {
         var13.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





