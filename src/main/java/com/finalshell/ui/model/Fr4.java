package com.finalshell.ui.model;

import com.finalshell.core.YI;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Fr4 extends AbstractTableModel {
   public ArrayList M;
   public String[] p;
   public Class[] d;

   public Fr4() {
      ArrayList var10001 = new ArrayList();
      long var2 = 400544122862714728L;
      ArrayList var1 = var10001;
      Ref.s(400544122862714728L, var1, var2);
      Class[] var10002 = new Class[]{Object.class};
      long var4 = 166001312983525994L;
      Class[] var3 = var10002;
      Ref.s(166001312983525994L, var3, var4);
      String[] var10003 = new String[]{""};
      long var6 = 609284192553407902L;
      String[] var5 = var10003;
      Ref.s(609284192553407902L, var5, var6);
   }

   public synchronized int C() {
      YI var16;
      int[] var10000 = SelectDownloadFolderPanel.O$arrint();
      Object var2 = false;
      int[] var1 = var10000;
      Object var6 = 400544122862714728L;
      Iterator var3 = ((ArrayList)Ref.g(400544122862714728L, var6)).iterator();

      Object var10001;
      while (true) {
         if (var3.hasNext()) {
            YI var4 = (YI)var3.next();
            var10001 = var4;
            Integer var10002 = (Integer)(Registry.emptyArgs());
            long var9 = 532275517761561192L;
            Object var8 = var10002;
            var10002 = Ref.h(532275517761561192L, var8, var9);

            try {
               var10002 = (Integer)var10002;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            Object var5 = var10002;
            var16 = (YI)var5;
            if (var1 != null) {
               break;
            }

            label40: {
               int var10003 = Registry.lookupField(635857280906233483L).getInt(null);
               if (var1 == null) {
                  if (var5 != var10003) {
                     break label40;
                  }

                  var16 = var4;
                  Object[] var17 = Registry.emptyArgs();
                  long var11 = 616518435013173083L;
                  Object[] var10 = var17;
                  Object var18 = Ref.h(616518435013173083L, var10, var11);

                  try {
                     var10003 = (Integer)var18;
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  Registry.lookupField(454428843955025864L).getInt(null);
               }

               if (var16 == var10003) {
                  var2++;
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var10001 = var2;
         break;
      }

      return (int)var10001;
   }

   public synchronized YI O() {
      long var13;
      int[] var10000 = SelectDownloadFolderPanel.O$arrint();
      YI var2 = null;
      int[] var1 = var10000;
      int var3 = 0;

      while (true) {
         Object var6 = 400544122862714728L;
         if (!(this < ((ArrayList)Ref.g(400544122862714728L, var6)).size())) {
            break;
         }

         Object var8 = 400544122862714728L;
         ArrayList var10002 = (ArrayList)Ref.g(400544122862714728L, var8);
         Object var10 = 400544122862714728L;
         YI var4 = (YI)this.get(((ArrayList)Ref.g(400544122862714728L, var10)).size() - 1 - var3);
         Object var10004 = Registry.emptyArgs();
         var13 = 532275517761561192L;
         Object var12 = var10004;
         var10004 = Ref.h(532275517761561192L, var12, var13);

         try {
            var16 = (Integer)var10004;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         int var5 = var16;
         if (var1 == null) {
            if (var5 == Registry.lookupField(476761782289979268L).getInt(null)) {
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
      SelectDownloadFolderPanel.O$arrint();
      Object var6 = 400544122862714728L;
      Iterator var4 = ((ArrayList)Ref.g(400544122862714728L, var6)).iterator();
      Fr4 var2 = this;

      int var10001;
      while (true) {
         label36:
         if (var4.hasNext()) {
            label34: {
               YI var5 = (YI)var4.next();
               if (var2 == null) {
                  var10001 = (var5.equals(var1)) ? 1 : 0;
                  if (var2 != null) {
                     break;
                  }

                  if (var10001 == 0) {
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

         var10001 = var3;
         break;
      }

      if (var2 == null) {
         if (var10001 <= -1) {
            return;
         }

         Object var8 = 400544122862714728L;
         ((ArrayList)Ref.g(400544122862714728L, var8)).remove(var1);
      }

      this.fireTableRowsDeleted(var3, var3);
   }

   public synchronized void O(YI var1) {
      int[] var10000 = SelectDownloadFolderPanel.O$arrint();
      int var3 = 0;
      int[] var2 = var10000;
      Object var6 = 400544122862714728L;
      Iterator var4 = ((ArrayList)Ref.g(400544122862714728L, var6)).iterator();

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
      Object var2 = 400544122862714728L;
      ((ArrayList)Ref.g(400544122862714728L, var2)).add(var1);
      Object var4 = 400544122862714728L;
      int var10003 = ((ArrayList)Ref.g(400544122862714728L, var4)).size() - 1;
      Object var6 = 400544122862714728L;
      var10003.fireTableRowsInserted((int)this, ((ArrayList)Ref.g(400544122862714728L, var6)).size());
   }

   public synchronized void D(YI var1) {
      Object var2 = 400544122862714728L;
      ((ArrayList)Ref.g(400544122862714728L, var2)).add(0, var1);
      this.fireTableDataChanged();
   }

   public void T(List var1) {
      int[] var2 = SelectDownloadFolderPanel.O$arrint();
      Object var3 = 400544122862714728L;
      Object var10001 = (ArrayList)Ref.g(400544122862714728L, var3);
      if (var2 == null) {
         var10001.clear();
         if (var1 == null) {
            return;
         }

         var10001 = this;
         Object var5 = 400544122862714728L;
         ArrayList var10002 = (ArrayList)Ref.g(400544122862714728L, var5);
      }

      var10001.addAll(var1);
   }

   public int V(int var1) {
      boolean var13;
      int var3 = -1;
      int[] var10000 = SelectDownloadFolderPanel.O$arrint();
      int var4 = 0;
      int[] var2 = var10000;
      Object var7 = 400544122862714728L;
      Iterator var5 = ((ArrayList)Ref.g(400544122862714728L, var7)).iterator();

      int var10001;
      while (true) {
         label33:
         if (var5.hasNext()) {
            YI var6 = (YI)var5.next();
            if (var2 == null) {
               var10001 = var1;
               if (var2 != null) {
                  break;
               }

               Object var10003 = Registry.emptyArgs();
               long var10 = 305126359001981386L;
               Object var9 = var10003;
               var10003 = Ref.h(305126359001981386L, var9, var10);

               try {
                  var13 = (Integer)var10003;
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               if (var6 == var13) {
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

         var10001 = var3;
         break;
      }

      return var10001;
   }

   public List y() {
      Object var1 = 400544122862714728L;
      return (ArrayList)Ref.g(400544122862714728L, var1);
   }

   public YI b(int var1) {
      int[] var2 = SelectDownloadFolderPanel.O$arrint();
      int var10000 = var1;
      if (var2 == null) {
         var10000 = var1 > -1 ? 1 : 0;
      }

      if (var2 == null) {
         Object var3 = 400544122862714728L;
         if (this < ((ArrayList)Ref.g(400544122862714728L, var3)).size()) {
            boolean var10002 = true;
         } else {
            boolean var7 = false;
         }
      }

      if ((var10000 & var1) != 0) {
         Object var5 = 400544122862714728L;
         return (YI)((ArrayList)Ref.g(400544122862714728L, var5)).get(var1);
      } else {
         return null;
      }
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      YI var3 = null;
      Object var4 = 400544122862714728L;
      if (this < ((ArrayList)Ref.g(400544122862714728L, var4)).size()) {
         Object var6 = 400544122862714728L;
         var3 = (YI)((ArrayList)Ref.g(400544122862714728L, var6)).get(var1);
      }

      return var3;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      Object var1 = 400544122862714728L;
      return ((ArrayList)Ref.g(400544122862714728L, var1)).size();
   }

   @Override
   public int getColumnCount() {
      Object var1 = 609284192553407902L;
      return ((String[])Ref.g(609284192553407902L, var1)).length;
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 609284192553407902L;
      return ((String[])Ref.g(609284192553407902L, var2))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      Object var2 = 166001312983525994L;
      return ((Class[])Ref.g(166001312983525994L, var2))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      int[] var10000 = SelectDownloadFolderPanel.O$arrint();
      boolean var4 = false;
      int[] var3 = var10000;
      int var6 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return var6 != 0;
   }
}





