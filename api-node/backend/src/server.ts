import App from './app';
import 'dotenv/config'

const PORT = process.env.PORT || 8001;

App.listen(PORT, () => console.log(`Aplicação rodando na porta ${PORT}`))