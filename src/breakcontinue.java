public class breakcontinue {
    public static void main(String[]args){
   // break and continue using loop!
       // for(int i=0;i<5;i++){
       //     System.out.println(i);
       //     System.out.println("java is great");             //for loop break
     //       if (i==2){
           //     System.out.println("ending the loop");
         //       break;
       //     }

     //   }
        //int i=0;
      //  while(i<5){
           // System.out.println(i);
         //   System.out.println("java is great");            //  while loop break
       //     if(i==2){
           //     System.out.println("ending the loop");
         //       break;
       //     }
          //  i++;
        //}


       // System.out.println("loop ends here");
       // int i=0;
       // do {                                         //do while loop  break
      //      System.out.println(i);
        //    System.out.println("java is great");
          //  if (i == 2) {
        //        System.out.println("ending the loop");
        //        break;
       //     }
        //    i++;
      //  }    while(i<5);
      //  System.out.println("loop ends here");
  //      for(int i=0;i<5;i++) {
    //        if (i == 2) {
    //            System.out.println("ending the loop");
    //            continue;
     //       }                                                    //continue for loop
       //     System.out.println(i);
     //       System.out.println("java is great");
   //     }
        int i=0;
        do {
            i++;                                          //do while loop  continue
            if (i == 2) {
                System.out.println("ending the loop");
                continue;
            }
              System.out.println(i);
              System.out.println("java is great");

          }    while(i<5);
          System.out.println("loop ends here");

    }
}
