<template>

<v-data-table
    :headers="headers"
    :items="prices"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'Prices',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "item", value: "item" },
            { text: "price", value: "price" },
        ],
        prices : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/prices')

      this.prices = temp.data._embedded.prices;

    },
    methods: {
    }
  }
</script>

