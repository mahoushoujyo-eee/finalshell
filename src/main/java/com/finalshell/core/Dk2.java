package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;

public class Dk2 {
   public Km2 r;

   public Dk2(Km2 var1) {
      long var3 = 491511652548502544L;
      Ref.s(491511652548502544L, var1, var3);
   }

   public void K(KeyEvent var1) {
      String var2 = Km2.U$String();
      if (var1.getModifiers() <= 0) {
         String var3 = (var1.getKeyChar() + "").toLowerCase();
         Object var13 = 491511652548502544L;
         Ref.g(491511652548502544L, var13);
         Object[] var10002 = Registry.emptyArgs();
         long var16 = 565315838989287146L;
         Object[] var15 = var10002;
         Ref.h(565315838989287146L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var53) {
            throw var53.getTargetException();
         }

         Dk2 var64 = var3.length();
         if (var2 == null) {
            if (var64 != null) {
               return;
            }

            var64 = this;
            Object var17 = 491511652548502544L;
            ((Km2)Ref.g(491511652548502544L, var17)).getRowCount();
         }

         Dk2 var5 = var64;
         Object var19 = 491511652548502544L;
         int var6 = ((Km2)Ref.g(491511652548502544L, var19)).getSelectedRow();
         boolean var7 = false;
         int var8 = var6 + 1;

         Object var67;
         while (var8 < var5) {
            Object var21 = 491511652548502544L;
            int var9 = ((Km2)Ref.g(491511652548502544L, var21)).convertRowIndexToModel(var8);
            var67 = Registry.packArgs(var9);
            long var24 = 291710787850444005L;
            Object[] var23 = (Object[])var67;
            var67 = Ref.h(291710787850444005L, var23, var24);

            try {
               var67 = var67;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            Object var10 = var67;
            String var11 = "";
            var67 = var10.getClass().equals(com.finalshell.ui.model.Ck4.class);
            if (var2 != null) {
               break;
            }

            label190: {
               label191: {
                  label192: {
                     if (var2 == null) {
                        if (var67 != null) {
                           com.finalshell.ui.model.Ck4 var12 = (com.finalshell.ui.model.Ck4)var10;
                           String var10006 = (String)(Registry.emptyArgs());
                           long var26 = 396085629172753019L;
                           Object[] var25 = var10006;
                           var10006 = Ref.h(396085629172753019L, var25, var26);

                           try {
                              var10006 = (String)var10006;
                           } catch (InvocationTargetException var52) {
                              throw var52.getTargetException();
                           }

                           var11 = var10006;
                           if (var2 == null) {
                              break label192;
                           }
                        }

                        var67 = var10.getClass().equals(Tf4.class);
                     }

                     if (var2 != null) {
                        break label191;
                     }

                     if (var67 != null) {
                        Tf4 var61 = (Tf4)var10;
                        String var70 = (String)(Registry.emptyArgs());
                        long var28 = 179612178163941306L;
                        Object[] var27 = var70;
                        var70 = Ref.h(179612178163941306L, var27, var28);

                        try {
                           var70 = (String)var70;
                        } catch (InvocationTargetException var51) {
                           throw var51.getTargetException();
                        }

                        var11 = var70;
                     }
                  }

                  var11 = var11.toLowerCase();
                  if (var2 != null) {
                     break label190;
                  }

                  var67 = var11.startsWith(var3);
               }

               if (var67 != null) {
                  var67 = this;
                  Object var29 = 491511652548502544L;
                  Ref.g(491511652548502544L, var29);
                  Object[] var10007 = Registry.packArgs(var8);
                  long var32 = 374989845389634076L;
                  Object[] var31 = var10007;
                  Ref.h(374989845389634076L, var31, var32);

                  try {
                     ;
                  } catch (InvocationTargetException var50) {
                     throw var50.getTargetException();
                  }

                  var7 = true;
                  if (var2 == null) {
                     break;
                  }
               }

               var8++;
            }

            var67 = var2;
            if (var2 != null) {
               break;
            }
         }

         if (var2 == null) {
            if (var67 != null) {
               return;
            }

            var67 = 0;
         }

         Object var55 = var67;

         while (var55 < var5) {
            Object var33 = 491511652548502544L;
            int var56 = ((Km2)Ref.g(491511652548502544L, var33)).convertRowIndexToModel((int)var55);
            Object[] var73 = Registry.packArgs(var56);
            long var36 = 291710787850444005L;
            Object[] var35 = var73;
            var73 = Ref.h(291710787850444005L, var35, var36);

            try {
               var73 = (Object[])((Object)var73);
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            label197: {
               label198: {
                  String var59;
                  label199: {
                     Object var57 = var73;
                     var59 = "";
                     var76 = var57.getClass().equals(com.finalshell.ui.model.Ck4.class);
                     if (var2 == null) {
                        if (var76) {
                           com.finalshell.ui.model.Ck4 var62 = (com.finalshell.ui.model.Ck4)var57;
                           String var10008 = (String)(Registry.emptyArgs());
                           long var38 = 396085629172753019L;
                           Object[] var37 = var10008;
                           var10008 = Ref.h(396085629172753019L, var37, var38);

                           try {
                              var10008 = (String)var10008;
                           } catch (InvocationTargetException var47) {
                              throw var47.getTargetException();
                           }

                           var59 = var10008;
                           if (var2 == null) {
                              break label199;
                           }
                        }

                        var76 = var57.getClass().equals(Tf4.class);
                     }

                     if (var2 != null) {
                        break label198;
                     }

                     if (var76) {
                        Tf4 var63 = (Tf4)var57;
                        String var79 = (String)(Registry.emptyArgs());
                        long var40 = 179612178163941306L;
                        Object[] var39 = var79;
                        var79 = Ref.h(179612178163941306L, var39, var40);

                        try {
                           var79 = (String)var79;
                        } catch (InvocationTargetException var46) {
                           throw var46.getTargetException();
                        }

                        var59 = var79;
                     }
                  }

                  var59 = var59.toLowerCase();
                  if (var2 != null) {
                     break label197;
                  }

                  var76 = var59.startsWith(var3);
               }

               if (var76) {
                  Object var41 = 491511652548502544L;
                  Ref.g(491511652548502544L, var41);
                  Object[] var10009 = Registry.packArgs((int)var55);
                  long var44 = 374989845389634076L;
                  Object[] var43 = var10009;
                  Ref.h(374989845389634076L, var43, var44);

                  try {
                     ;
                  } catch (InvocationTargetException var45) {
                     throw var45.getTargetException();
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               var55++;
            }

            if (var2 != null) {
               break;
            }
         }
      }
   }
}





