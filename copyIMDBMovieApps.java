public class copyIMDBMovieApps {
    public static void main(String[] args){
        String actorName = "Tom cruise";
        int yearOfBorn = 1962;
        int age = 2022 - yearOfBorn;

        //section 1
        String[] movieTitle = {
                "lord of rings", "Nakya borolouk", "kaya bololouk", "lord of water",
                "lord of world", "Lord of land", "lord of mass"
        };

        //Section 2
        float[] movieRating = {
                7.7F, 7.9F, 8.0F, 6.5F,
                5.9F, 5.0F, 4.9F
        };

        //Section 3
        System.out.println("Actor's Name" + actorName);
        System.out.println("Actor born in " + yearOfBorn + " present age of actor " + age);

        System.out.println("Movie's ");

        for (int i = 0; i < movieTitle.length; i++) {
            System.out.println(movieTitle[i ] + ", Rating is: " +getRating(movieRating[i]));
        }
    }
    //Section 4
    static String getRating(float rating){
        if(rating <= 5){
            return "Bad";
        }else if(rating > 5.0 && rating <= 6.0){
            return "average";
        }else if(rating > 6.0 && rating <= 7.0){
            return "Good";
        }else if(rating > 7.0 && rating <= 8.0){
            return "Vary Good";
        }else {
            return "Excellent";
        }
    }
}
