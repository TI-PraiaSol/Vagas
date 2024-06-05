"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
const cors_1 = __importDefault(require("cors"));
//import router from './routes'
const App = (0, express_1.default)();
App.use(express_1.default.json());
App.use((0, cors_1.default)());
//app.use(router)
App.get('/', (req, res) => res.status(200).send('Rodando Aqui!'));
exports.default = App;