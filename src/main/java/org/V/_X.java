package org.v;

public enum _X {
   CLASS_DECLARATION, INTERFACE_DECLARATION, ANNOTATION_TYPE_DECLARATION;
   private static final _X[] s;

   private static _X[] c() {
      return new _X[]{CLASS_DECLARATION, INTERFACE_DECLARATION, ANNOTATION_TYPE_DECLARATION};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "in\u0000\u0004R`_oa\r\u0016S~Ocm\u000f\u001bkl\u000f\u0018U~Ocm\u000f\bUfKo}\u0005\u0012BsZxc\u0015\u001eNq\u0015cl\u0015\u0012SyZig\u001e\u0013D|Wkp\u0000\u0003HpU";
      int var5 = "in\u0000\u0004R`_oa\r\u0016S~Ocm\u000f\u001bkl\u000f\u0018U~Ocm\u000f\bUfKo}\u0005\u0012BsZxc\u0015\u001eNq\u0015cl\u0015\u0012SyZig\u001e\u0013D|Wkp\u0000\u0003HpU"
         .length();
      char var2 = 17;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 41;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 41;
               var10006 = var6;
            } else {
               var13 = 41;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 41;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 3;
                     break;
                  case 1:
                     var29 = 11;
                     break;
                  case 2:
                     var29 = 104;
                     break;
                  case 3:
                     var29 = 126;
                     break;
                  case 4:
                     var29 = 40;
                     break;
                  case 5:
                     var29 = 22;
                     break;
                  default:
                     var29 = 50;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            s = c();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}






