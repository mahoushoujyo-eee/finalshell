import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class fr_4 extends AbstractTableModel {
   private ArrayList M;
   String[] p;
   Class[] d;

   fr_4() {
      com.c.c(400544122862714728L).set(this, new ArrayList());
      com.c.c(166001312983525994L).set(this, new Class[]{Object.class});
      com.c.c(609284192553407902L).set(this, new String[]{""});
   }

   public synchronized int C() {
      int[] var10000 = Jx_2.O();
      int var2 = 0;
      int[] var1 = var10000;
      Iterator var3 = ((ArrayList)com.c.c(400544122862714728L).get(this)).iterator();

      while (true) {
         if (var3.hasNext()) {
            YI var4 = (YI)var3.next();
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(532275517761561192L);
            Object[] var10002 = var10001;
            YI var12 = var4;
            Method var8 = var10003;

            try {
               var9 = (Integer)var8.invoke(var12, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            int var5 = var9;
            var10 = var5;
            if (var1 != null) {
               break;
            }

            label40: {
               int var13 = com.c.c(635857280906233483L).getInt(null);
               if (var1 == null) {
                  if (var5 != var13) {
                     break label40;
                  }

                  var10001 = com.c.f();
                  var10003 = com.c.d(616518435013173083L);
                  var10002 = var10001;
                  YI var15 = var4;
                  Method var11 = var10003;

                  try {
                     var10 = (Integer)var11.invoke(var15, var10002);
                  } catch (InvocationTargetException var7) {
                     throw var7.getTargetException();
                  }

                  var13 = com.c.c(454428843955025864L).getInt(null);
               }

               if (var10 == var13) {
                  var2++;
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var10 = var2;
         break;
      }

      return var10;
   }

   public synchronized YI O() {
      int[] var10000 = Jx_2.O();
      YI var2 = null;
      int[] var1 = var10000;
      int var3 = 0;

      while (var3 < ((ArrayList)com.c.c(400544122862714728L).get(this)).size()) {
         YI var4 = (YI)((ArrayList)com.c.c(400544122862714728L).get(this)).get(((ArrayList)com.c.c(400544122862714728L).get(this)).size() - 1 - var3);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(532275517761561192L);
         Object[] var10002 = var10001;
         YI var9 = var4;
         Method var7 = var10003;

         try {
            var8 = (Integer)var7.invoke(var9, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         int var5 = var8;
         if (var1 == null) {
            if (var5 == com.c.c(476761782289979268L).getInt(null)) {
               var2 = var4;
               break;
            }

            var3++;
         }
      }

      return var2;
   }

   public synchronized void q(YI var1) {
      int var3 = -1;
      int[] var10000 = Jx_2.O();
      Iterator var4 = ((ArrayList)com.c.c(400544122862714728L).get(this)).iterator();
      int[] var2 = var10000;

      while (true) {
         label36:
         if (var4.hasNext()) {
            label34: {
               YI var5 = (YI)var4.next();
               if (var2 == null) {
                  var6 = var5.equals(var1);
                  if (var2 != null) {
                     break;
                  }

                  if (var6 == 0) {
                     break label34;
                  }

                  var3++;
               }

               if (var2 == null) {
                  break label36;
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      if (var2 == null) {
         if (var6 <= -1) {
            return;
         }

         ((ArrayList)com.c.c(400544122862714728L).get(this)).remove(var1);
      }

      this.fireTableRowsDeleted(var3, var3);
   }

   public synchronized void O(YI var1) {
      int[] var10000 = Jx_2.O();
      int var3 = 0;
      int[] var2 = var10000;
      Iterator var4 = ((ArrayList)com.c.c(400544122862714728L).get(this)).iterator();

      while (true) {
         label24:
         if (var4.hasNext()) {
            YI var5 = (YI)var4.next();
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               if (var5.equals(var1) && var2 == null) {
                  break label24;
               }

               var3++;
            }

            if (var2 == null) {
               continue;
            }
         }

         this.fireTableCellUpdated(var3, 0);
         break;
      }
   }

   public synchronized void S(YI var1) {
      ((ArrayList)com.c.c(400544122862714728L).get(this)).add(var1);
      this.fireTableRowsInserted(((ArrayList)com.c.c(400544122862714728L).get(this)).size() - 1, ((ArrayList)com.c.c(400544122862714728L).get(this)).size());
   }

   public synchronized void D(YI var1) {
      ((ArrayList)com.c.c(400544122862714728L).get(this)).add(0, var1);
      this.fireTableDataChanged();
   }

   public void T(List var1) {
      int[] var2 = Jx_2.O();
      ArrayList var10000 = (ArrayList)com.c.c(400544122862714728L).get(this);
      if (var2 == null) {
         var10000.clear();
         if (var1 == null) {
            return;
         }

         var10000 = (ArrayList)com.c.c(400544122862714728L).get(this);
      }

      var10000.addAll(var1);
   }

   public int V(int var1) {
      int var3 = -1;
      int[] var10000 = Jx_2.O();
      int var4 = 0;
      int[] var2 = var10000;
      Iterator var5 = ((ArrayList)com.c.c(400544122862714728L).get(this)).iterator();

      while (true) {
         label33:
         if (var5.hasNext()) {
            YI var6 = (YI)var5.next();
            if (var2 == null) {
               var8 = var1;
               if (var2 != null) {
                  break;
               }

               Object[] var10002 = com.c.f();
               Method var10004 = com.c.d(305126359001981386L);
               Object[] var10003 = var10002;
               YI var10 = var6;
               Method var10001 = var10004;

               try {
                  var9 = (Integer)var10001.invoke(var10, var10003);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               if (var1 == var9) {
                  var3 = var4;
                  if (var2 == null) {
                     break label33;
                  }
               }

               var4++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   List y() {
      return (ArrayList)com.c.c(400544122862714728L).get(this);
   }

   public YI b(int var1) {
      int[] var2 = Jx_2.O();
      int var10000 = var1;
      if (var2 == null) {
         var10000 = var1 > -1 ? 1 : 0;
      }

      int var10001 = var1;
      if (var2 == null) {
         var10001 = var1 < ((ArrayList)com.c.c(400544122862714728L).get(this)).size() ? 1 : 0;
      }

      return (var10000 & var10001) != 0 ? (YI)((ArrayList)com.c.c(400544122862714728L).get(this)).get(var1) : null;
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      YI var3 = null;
      if (var1 < ((ArrayList)com.c.c(400544122862714728L).get(this)).size()) {
         var3 = (YI)((ArrayList)com.c.c(400544122862714728L).get(this)).get(var1);
      }

      return var3;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      return ((ArrayList)com.c.c(400544122862714728L).get(this)).size();
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(609284192553407902L).get(this)).length;
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(609284192553407902L).get(this))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      return ((Class[])com.c.c(166001312983525994L).get(this))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      int[] var10000 = Jx_2.O();
      boolean var4 = false;
      int[] var3 = var10000;
      int var6 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return (boolean)var6;
   }
}





