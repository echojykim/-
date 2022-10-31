<template>
    <div align="center">
        <h2>게시물 작성</h2>
        <basic-board-register-form @submit="onSubmit"/>
    </div>
</template>

<script>

import BasicBoardRegisterForm from '@/components/board/BasicBoardRegisterForm.vue'
import axios from 'axios'

export default {
    name: 'BoardRegisterPage',
    components: {
        BasicBoardRegisterForm 
    },
    methods: {
        onSubmit (payload) {
            const { title, content, writer } = payload
            axios.post('http://localhost:7777/basicBoard/board/register', { title, writer, content })
                    .then(() => {
                        alert('게시물 등록 성공!')
                    
                        this.$router.push({
                            name: 'BoardListPage'
                        })
                    })
                    .catch(() => {
                        alert('문제발생!')
                    })
            }
        }
    
    }


</script>