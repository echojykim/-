import {
    FETCH_BASIC_BOARD_LIST,
    FETCH_BASIC_BOARD
} from './mutation-types'

export default {
    [FETCH_BASIC_BOARD_LIST] (state, basicBoards) {
        state.basicBoards = basicBoards 
    }, 
    [FETCH_BASIC_BOARD] (state, basicBoard) {
         state.basicBoard = basicBoard 
     }
}

