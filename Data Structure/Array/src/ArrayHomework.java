public class ArrayHomework {
    public static int checkStrInItem(String[] dataset, String Str) {
        int count = 0;
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i].indexOf(Str) > 0) {
                count++;
            };
        }
        return count;
    }
    public static void main(String[] args) {
        /**
         * 다음과 같은 DataSet이 주어진다고 해봅시다.
         * 다음 배열에 "M"이 들어있는 것은 총 몇개 일까요?
         * - 참고
         *   - length = 배열에 들어있는 아이템 갯수
         *   - 문자열.indexOf(String key) : 문자 key가 해당 문자열에 있으면 해당 문자의 위치 (index)값을 리턴하고, 없으면 -1을 리턴함.
         *
         * 저는 따로 함수를 만들어서 제작해보겠습니다.
         */

        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        System.out.println(checkStrInItem(dataset, "M"));
    }
}
