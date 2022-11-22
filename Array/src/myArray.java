public class myArray {
    int[] intArr; // integer 배열
    int count; // 갯수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    // 기본 생성자 생성
    public myArray() {
        ARRAY_SIZE = 10; // 사이즈 지정 안할시 기본값 10으로 설정
        count = 0; // 갯수 0으로 설정
        intArr = new int[ARRAY_SIZE]; // 새로운 배열로 설정 ( 사이즈는 ARRAY_SIZE 값 )
    }

    // 오버라이딩 생성자 생성
    public myArray(int size) {
        ARRAY_SIZE = size; // 사이즈 지정할시 지정한 사이즈로 설정
        count = 0; // 갯수 0으로 설정
        intArr = new int[size]; // 새로운 배열로 설정 ( 사이즈는 size 값 )
    }

    /**
     * 배열에 값을 추가합니다.
     * @param num
     */
    public void addElement(int num) {
        if (count >= ARRAY_SIZE) { // 만약 count가 배열크기를 넘는다면
            // 예외 발생
            throw new ArrayStoreException("더이상 저장할 수 있는 공간이 없습니다.");
        }
        intArr[count++] = num; // 아니라면 배열에 값 추가하고 count += 1
    }

    // 배열 중간에 값을 추가합니다.
    public void insertElement(int position, int num) {
        // 만약 포지션 값이 이상하게 들어올 경우
        if (position < 0 || position >= count) {
            // 예외 발생
            throw new ArrayStoreException("포지션 값이 이상합니다.");
        }

        // 만약 count가 배열 크기를 넘는다면
        if (count >= ARRAY_SIZE) {
            // 예외 발생
            throw new ArrayStoreException("더이상 저장할 수 있는 공간이 없습니다.");
        }

        // 위 if문 두개에 안걸린다면 중간에 넣기를 실행
        // i는 초기값 count-1개, position 이상일 경우 종료, i가 하나씩 줄어들면서 진행
        for (int i = count - 1; i >= position; i--) {
            // 배열에 i-1위치에 있는 값을 i 위치에 있는 값으로 변경
            intArr[i+1] = intArr[i];
        }

        // position 인덱스에 num값 입력
        intArr[position] = num;
        // count + 1
        count++;
    }

    // 배열 중간에 값을 삭제합니다.
    public int deleteElement(int position) {
        // 만약 count가 0라면
        if (isEmpty()) {
            // 예외 발생
            throw new ArrayStoreException("이미 값이 없는 배열입니다.");
        }

        // 만약 포지션 값이 이상하게 들어올 경우
        if (position < 0 || position > count - 1) {
            // 예외 발생
            throw new ArrayStoreException("포지션 값이 이상합니다.");
        }

        // ret을 intArr[position] 값으로 할당
        int ret = intArr[position];

        // i 초기값은 position으로, count - 1번까지 돌린다
        for (int i = position; i <= count - 1; i++) {
            // intArr[i]를 intArr[i+1]로 바꾼다.
            intArr[i] = intArr[i+1];
        }

        // count - 1
        count--;

        // ret return
        return ret;
    }

    // 배열 출력
    public void checkMyArr() {
        for(int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println(intArr[i]);
        }
    }

    // 값이 비었는지 확인
    public boolean isEmpty() {
        // 만약 count가 0이라면
        if ( count == 0 ) {
            // true 리턴
            return true;
        }
        // 아니면 false
        return false;
    }

    // 카운트 수 확인
    public int getCount() {
        return count;
    }
}
