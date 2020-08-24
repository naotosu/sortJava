class Sort {
    public static void main(String[] args) {
        int[] heights = { 172, 149, 152, 191, 155};
        System.out.println("昇順で並べ替えます");
        System.out.println("確認用に二回目のUPファイルです");
        java.util.Arrays.sort(heights);
        for (int height :heights) {
            System.out.println(height);
        }
    }
}

//ブランチをmaster => working　切り替え　2回目