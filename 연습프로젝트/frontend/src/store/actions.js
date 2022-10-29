import {
     FETCH_BOARD_LIST,
//     FETCH_BOARD

} from './mutation-types'

import axios from 'axios'
// import router from '@/router'

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/basicBoard/board/list') //여기 정보 요청
                        //스프링 컨트롤러가 정보 수신
                .then((res) => { //스프링이 return한 결과는 res로 들어간다. 
                    commit(FETCH_BOARD_LIST, res.data)
                })
    },
    // fetchBoard ({ commit }, boardNo) { //스프링이 return한 결과는 res로 들어감 
    //     return axios.get('http://localhost:7777/basicBoard/${boardNo}')
    //             .then((res) => {
    //                 commit(FETCH_BOARD, res.data)
    //             })
    // }
}