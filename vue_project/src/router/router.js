import {createRouter, createWebHistory} from 'vue-router'
import Home from '../pages/Home.vue'
import Search from '../pages/app/Search.vue'

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/search',
        name: 'Search',
        component: Search
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router