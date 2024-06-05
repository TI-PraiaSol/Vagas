import express, { NextFunction, Request, Response } from 'express'
import cors from 'cors'
//import router from './routes'
const App = express()

App.use(express.json())
App.use(cors())
//app.use(router)
App.get('/', (req, res) => res.status(200).send('Rodando Aqui!'))


export default App;