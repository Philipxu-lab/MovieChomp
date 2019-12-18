class rottenPotato {
 public static void main(String[] args) {
     int[][] ratings =  { {4,6,2,5},
                          {7,9,4,8},
                          {6,9,3,7} };
                          
                          
    }
    public static int movieAvgRating(int[][] ratings, int movie) {
        double sum = 0;
        int avg = 0;
        for (int i = 0; i < ratings[0].length; i++) {
            sum += ratings[i][movie];
        }
        avg = (int)(sum/ratings.length);
        //System.out.print(ratings[movie].length);
        System.out.print(avg);
        return avg;
    }
    public static int reviewerAvgRating (int[][] ratings, int reviewer) {
        double sum = 0;
        int avg = 0;
        for (int i = 0; i < ratings[0].length; i++) {
            sum += ratings[reviewer][i];
        }
        avg = (int)(sum/ratings.length);
        System.out.print(avg);
        return avg;
    }
    public static int avgRating2018(int[][] ratings) {
        double sum = 0;
        double numRatings = ratings.length * ratings[0].length;
        for (int r = 0; r < ratings.length; r++) {
            for (int c = 0; c < ratings[0].length; c++) {
                sum += ratings[r][c];
            }
        }
        return (int)(sum/numRatings);
    }
        public static int hardestReviewer2018(int[][] ratings) {
        int hardestIndex = 0;
        int hardestAvg = reviewerAvgRating(ratings, 0);
        for (int r = 1; r < ratings.length; r++) {
            int newAvg =  reviewerAvgRating(ratings, r);
            if (newAvg < hardestAvg) {
                hardestIndex = r;
                hardestAvg = newAvg;
            }
        }
        return hardestIndex;
    }
        public static int worstMovie2018(int[][] ratings) {
        int worstIndex = 0;
        int worstAvg   = movieAvgRating(ratings, 0);
        for (int c = 1; c < ratings[0].length; c++) {
            int newAvg = movieAvgRating(ratings, c);
            if (newAvg < worstAvg) {
                worstIndex = c;
                worstAvg = newAvg;
            }
        }

        return worstIndex;
    }
}