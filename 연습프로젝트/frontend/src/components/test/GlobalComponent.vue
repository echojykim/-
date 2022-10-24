<template>
    <button @click="addCounter">{{ counter }}</button> <!-- //버튼을 클릭할때 addCounter를 작동시킨다. 이 카운터가 this.initialTest를 리턴시킨다 -->
</template>

<script>
export default {
    name: 'global-component',
    props: ['initialTest'],
    data () {
        return {
            counter: this.initialTest
        }
    },

    methods: {
        addCounter () { //기능의 이름이 addCounter. 내가 지정한 counter를 1씩 +시키는것. 언제냐면 버튼 클릭시. 
            this.counter += 1 
        }
    }
}

</script>