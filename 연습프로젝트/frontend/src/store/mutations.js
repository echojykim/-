import {
    FETCH_JPA_BOARD_LIST,
    FETCH_JPA_BOARD
} from './mutation-types'

export default {
    [FETCH_JPA_BOARD_LIST] (state, boards) {
        state.jpaBoards = boards 
    }, 
    [FETCH_JPA_BOARD] (state, board) {
         state.jpaBoard = board 
     }
}

