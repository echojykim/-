<template>
  <div>
    <h3>게시물 목록</h3>
    <table border="1">
      <tr>
        <th align="center" width="100">번호</th>
        <th align="center" width="640">제목</th>
        <th align="center" width="150">작성자</th>
        <th align="center" width="240">등록일자</th>
      </tr>
      <tr v-if="!board || (Array.isArray(boards) && boards.length === 0)">
        <!-- v-if는 vue에서 제공하는 if조건문. 어레이 배열을 불러왔을때 길이가 0이면 아래 현재 등록된 게시물이 없습니다라고 뜨게 해주세요-->
        <td colspan="4">현재 등록된 게시물이 없습니다!</td>
      </tr>
      <tr v-else v-for="board in boards" :key="board.boardNo">
        <!-- for문이 v-for문 -->
        <td align="center">
          {{ board.boardNo }}
        </td>
        <td align="left">
          <router-link
            :to="{
              name: 'BoardReadPage',
              params: { boardNo: board.boardNo.toString() },
            }"
          >
            <!-- 이 타이틀에 맞는 보드넘버로 이동하겠다. 왜냐면 기준 :key가 보드넘버기때문-->
            {{ board.title }}
          </router-link>
        </td>
        <td align="right">
          {{ board.writer }}
        </td>
        <td align="center">
          {{ board.regDate }}
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "BoardList",
  props: {
    //이것덕분에 '(Array.isArray(boards) && boards.length === 0)'내의 길이를 확인 가능
    boards: {
      type: Array,
    },
  },
  beforeUpdate() {
    console.log("check: " + this.boards);
  },
};
</script>
