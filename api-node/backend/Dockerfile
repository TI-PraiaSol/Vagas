FROM node:22.2.0-alpine3.20

WORKDIR /Application

COPY package* .

RUN yarn install

COPY . .

ENTRYPOINT ["yarn", "run" ]
CMD ["dev"]
