package Tiger0415

import Tiger0415.buildTypes.*
import Tiger0415.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0415")
    name = "Tiger0415"

    vcsRoot(Tiger0415_cVCSroot)

    buildType(Tiger0415_Hi0)
    buildType(Tiger0415_Hi3)
    buildType(Tiger0415_Hi2)
    buildType(Tiger0415_Hi1)
})
