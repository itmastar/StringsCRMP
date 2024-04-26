public class StringsCRMP {
    public static void main(String[] args) {

        String name="ITMastar";
        System.out.println(name.length());
        String name1="Mohan";
        String name2="mohan";
        String name3="star";
        System.out.println(name1.length());
        System.out.println(name.charAt(0));
        System.out.println(name1.charAt(2));
        System.out.println(name.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name.concat(name1));
        System.out.println(name+name1);
        System.out.println(name+" "+name1);
        System.out.println(name.concat(" ").concat(name1));
        System.out.println(name1.equalsIgnoreCase(name2));
//        System.out.println(name.compareTo(name2));
        System.out.println(name1.contains("an"));
        System.out.println(name.contains(name3));
        System.out.println(name.startsWith("i"));
        System.out.println(name.endsWith("r"));

        //ITMastar
        System.out.println(name.substring(4));
        System.out.println(name.substring(0,2));
        //Mast
        System.out.println(name.substring(2,6));
        String sentence="I love JAVA";
        //love
        String desiredOutput="love";
       String extractedWord= sentence.substring(2,6);
       if(extractedWord.equals(desiredOutput)){
           System.out.println("Pass");
       }else{
           System.out.println("Try again ");
       }
       // I LOVE INDIA
        String extractLove=sentence.substring(2,6);
        System.out.println(extractLove);
        String loveCapitalized=extractLove.toUpperCase();
        System.out.println(loveCapitalized);
        System.out.println("I".concat(" ").concat(loveCapitalized).concat(" ").concat("INDIA"));
        System.out.println("I"+" "+loveCapitalized+" "+"INDIA");
        System.out.println(sentence.replace("JAVA","INDIA"));
        System.out.println(sentence.substring(0,1).concat(" ").concat(sentence.substring(2,6).toUpperCase()).concat(" ").concat("INDIA"));





    }
}
