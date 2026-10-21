public abstract class UV {
   public static String[] F;
   public static String[] d;
   public static char[] t;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[29];
      int var4 = 0;
      String var3 = "Naj{\bNiyuyBZ@\u0005Ninbn'Z@\u000bbYrd{AXU\u001cu{4jYBSs4W@YBYb`}@E\u0010ndeaJXD\u0005Nlysk\nNlcqpMQZhn\u0006Nni\u007fnU\u0006N}b~uU\u0004Njdv\u0007@ffusT@\u0005Nlys{\u0006Nld}lM\u0005Nkjd}\u0006N|b~uU\u0005Q}y\u007fn\u0007N}zyrH@\u0005Nlysy\u0011Z@\u000bs]sf}JY\u0010xd`qL_\u0004Nnh{\u0004Nib~\u0005Nlysm\u0004Nlys\u0005lWSHD\bNld}q@ZP\u0004Nlj~\u0007N|\u007ftySF\u0005N}{\u007fo";
      int var5 = "Naj{\bNiyuyBZ@\u0005Ninbn'Z@\u000bbYrd{AXU\u001cu{4jYBSs4W@YBYb`}@E\u0010ndeaJXD\u0005Nlysk\nNlcqpMQZhn\u0006Nni\u007fnU\u0006N}b~uU\u0004Njdv\u0007@ffusT@\u0005Nlys{\u0006Nld}lM\u0005Nkjd}\u0006N|b~uU\u0005Q}y\u007fn\u0007N}zyrH@\u0005Nlysy\u0011Z@\u000bs]sf}JY\u0010xd`qL_\u0004Nnh{\u0004Nib~\u0005Nlysm\u0004Nlys\u0005lWSHD\bNld}q@ZP\u0004Nlj~\u0007N|\u007ftySF\u0005N}{\u007fo"
         .length();
      char var2 = 4;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 73;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 93;
                        break;
                     case 1:
                        var46 = 102;
                        break;
                     case 2:
                        var46 = 98;
                        break;
                     case 3:
                        var46 = 121;
                        break;
                     case 4:
                        var46 = 117;
                        break;
                     case 5:
                        var46 = 72;
                        break;
                     default:
                        var46 = 93;
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
                     F = new String[]{
                        var0[3],
                        var0[17],
                        var0[9],
                        var0[14],
                        var0[15],
                        var0[7],
                        var0[13],
                        var0[18],
                        var0[27],
                        var0[28],
                        var0[0],
                        var0[6],
                        var0[19],
                        var0[26],
                        var0[12],
                        var0[8],
                        var0[2],
                        var0[21],
                        var0[5],
                        var0[11],
                        var0[24],
                        var0[1],
                        var0[23],
                        var0[25],
                        var0[22]
                     };
                     d = new String[]{var0[16], var0[10], var0[20], var0[4]};
                     t = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
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

                  var3 = "#\u0004\u000f\u0011\u0014\u0005#\u0011\r\u0014\u0001";
                  var5 = "#\u0004\u000f\u0011\u0014\u0005#\u0011\r\u0014\u0001".length();
                  var2 = 5;
                  var8 = -1;
            }

            var10000 = 36;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}






