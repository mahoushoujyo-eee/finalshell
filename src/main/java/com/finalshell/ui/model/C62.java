package com.finalshell.ui.model;

import com.finalshell.core.LD3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Edit;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class C62 extends AbstractTableModel {
   ArrayList y;
   public static String c;
   public static String v;
   public static String E;
   public static String D;
   public static String a;
   public static String S;
   String[] K;
   String w;

   public C62() {
      ArrayList var10001 = new ArrayList();
      long var2 = 484427497215582043L;
      ArrayList var1 = var10001;
      Ref.s(484427497215582043L, var1, var2);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(503715714228816317L).get(null),
         (String)Registry.lookupField(130535746700416935L).get(null),
         (String)Registry.lookupField(606540321731770853L).get(null),
         (String)Registry.lookupField(336224385902465484L).get(null),
         (String)Registry.lookupField(173677803159033316L).get(null)
      };
      long var4 = 125333540525210921L;
      String[] var3 = var10002;
      Ref.s(125333540525210921L, var3, var4);
   }

   public String M(int var1) {
      Object var2 = 125333540525210921L;
      return ((String[])Ref.g(125333540525210921L, var2))[var1];
   }

   public int C(String var1) {
      Edit.t();
      Object var3 = -1;
      Object var4 = false;
      Object var7 = 484427497215582043L;
      Iterator var5 = ((ArrayList)Ref.g(484427497215582043L, var7)).iterator();
      C62 var2 = this;

      Object var10001;
      while (true) {
         label33:
         if (var5.hasNext()) {
            LD3_2 var6 = (LD3_2)var5.next();
            if (var2 == null) {
               var10001 = var6;
               String var10002 = Registry.emptyArgs();
               long var10 = 194080076253066315L;
               Object[] var9 = var10002;
               var10002 = Ref.h(194080076253066315L, var9, var10);

               try {
                  var10002 = (String)var10002;
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               boolean var14 = var10002.equals(var1);
               if (var2 != null) {
                  break;
               }

               if (var14) {
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

      return (int)var10001;
   }

   public void Z(ArrayList var1) {
      long var3 = 484427497215582043L;
      Ref.s(484427497215582043L, var1, var3);
      this.fireTableDataChanged();
   }

   public LD3_2 p(int var1) {
      Object var2 = 484427497215582043L;
      return (LD3_2)((ArrayList)Ref.g(484427497215582043L, var2)).get(var1);
   }

   @Override
   public int getRowCount() {
      Object var1 = 484427497215582043L;
      return ((ArrayList)Ref.g(484427497215582043L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 125333540525210921L;
      return ((String[])Ref.g(125333540525210921L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 125333540525210921L;
      return ((String[])Ref.g(125333540525210921L, var1)).length;
   }

   @Override
   public Class getColumnClass(int var1) {
      return var1 == 0 ? Boolean.class : LD3_2.class;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Edit.t();
      Object var5 = 484427497215582043L;
      LD3_2 var4 = (LD3_2)((ArrayList)Ref.g(484427497215582043L, var5)).get(var1);
      LD3_2 var10001 = (LD3_2)var2;
      if (this == null) {
         if (var2 != 0) {
            Object var11 = 484427497215582043L;
            return ((ArrayList)Ref.g(484427497215582043L, var11)).get(var1);
         }

         var10001 = var4;
         Object[] var10002 = Registry.emptyArgs();
         long var8 = 194080076253066315L;
         Object[] var7 = var10002;
         Ref.h(194080076253066315L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         Object var9 = 390775992362179855L;
         this.equals((String)Ref.g(390775992362179855L, var9));
      }

      return Boolean.valueOf((boolean)var10001);
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      Edit.t();
      super.setValueAt(var1, var2, var3);
      Object var9 = 484427497215582043L;
      LD3_2 var5 = (LD3_2)((ArrayList)Ref.g(484427497215582043L, var9)).get(var2);
      C62 var4 = this;
      if (this == null) {
         if (var3 != 0) {
            return;
         }

      }

      if (this == null) {
         boolean var6 = true;
         if (false) {
            return;
         }

         Object[] var10003 = Registry.emptyArgs();
         long var12 = 194080076253066315L;
         Object[] var11 = var10003;
         var10003 = Ref.h(194080076253066315L, var11, var12);
         long var14 = 390775992362179855L;
         Object var13 = var10003;
         Ref.s(390775992362179855L, var13, var14);
         Object[] var10004 = Registry.packArgs(var6);
         long var16 = 504080307980644796L;
         Object[] var15 = var10004;
         Ref.h(504080307980644796L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }
      }

      Object var17 = 484427497215582043L;

      byte var10002;
      label59: {
         for (LD3_2 var8 : (ArrayList)Ref.g(484427497215582043L, var17)) {
            label76: {
               if (var4 == null) {
                  var10002 = (var8.equals(var5)) ? 1 : 0;
                  if (var4 != null) {
                     break label59;
                  }

                  if (var10002 != 0) {
                     break label76;
                  }
               }

               Object[] var27 = Registry.packArgs(false);
               long var20 = 504080307980644796L;
               Object[] var19 = var27;
               Ref.h(504080307980644796L, var19, var20);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            if (var4 != null) {
               break;
            }
         }

         var10002 = 0;
      }

      int var25 = var10002;

      do {
         Object var21 = 484427497215582043L;
         if (!(this < ((ArrayList)Ref.g(484427497215582043L, var21)).size())) {
            break;
         }

         this.fireTableCellUpdated(var25, 0);
         var25++;
      } while (var4 == null);
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      Ky4[] var3 = Edit.t();
      int var10000 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            return true;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }

   public String c() {
      Object var1 = 390775992362179855L;
      return (String)Ref.g(390775992362179855L, var1);
   }

   public void f(String var1) {
      long var3 = 390775992362179855L;
      Ref.s(390775992362179855L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[6];
      int var4 = 0;
      String var3 = "乯朜\u0002簯垭\u0002弇剫\u0002呙秖";
      int var5 = "乯朜\u0002簯垭\u0002弇剫\u0002呙秖".length();
      char var2 = 2;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 62;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label48: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 106;
                        break;
                     case 1:
                        var46 = 24;
                        break;
                     case 2:
                        var46 = 34;
                        break;
                     case 3:
                        var46 = 123;
                        break;
                     case 4:
                        var46 = 70;
                        break;
                     case 5:
                        var46 = 113;
                        break;
                     default:
                        var46 = 35;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var29;
                  if ((var8 += var2) >= var5) {
                     Registry.lookupField(130535746700416935L).set(null, var0[3]);
                     Registry.lookupField(606540321731770853L).set(null, var0[1]);
                     Registry.lookupField(336224385902465484L).set(null, var0[0]);
                     Registry.lookupField(173677803159033316L).set(null, var0[4]);
                     Registry.lookupField(451825395071576855L).set(null, var0[5]);
                     Registry.lookupField(503715714228816317L).set(null, var0[2]);
                     return;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var29;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "窲双\u0003畵战吘";
                  var5 = "窲双\u0003畵战吘".length();
                  var2 = 2;
                  var8 = -1;
            }

            var10000 = 55;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





