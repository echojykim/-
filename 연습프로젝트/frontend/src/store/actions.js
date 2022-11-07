import {
     FETCH_JPA_BOARD_LIST,
     FETCH_JPA_BOARD,

} from './mutation-types'

import axios from 'axios'
//import router from '@/router'
// npm install axios --save-dev

export default {
    fetchJpaBoardList ({ commit }) {
        return axios.get('http://localhost:7777/62th/board/list') //여기 정보 요청
                        //스프링 컨트롤러가 정보 수신
                .then((res) => { //스프링이 return한 결과는 res로 들어간다. 
                    commit(FETCH_JPA_BOARD_LIST, res.data)
                })
    },
    fetchJpaBoard ({ commit }, boardNo) { //스프링이 return한 결과는 res로 들어감 
        return axios.get(`http://localhost:7777/62th/board/${boardNo}`)
                .then((res) => {
                    commit(FETCH_JPA_BOARD, res.data)
                })
    }
}